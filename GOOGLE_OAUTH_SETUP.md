# Hướng dẫn cấu hình Google OAuth cho TinaMusic

## 1. Tạo Google OAuth App

1. Truy cập [Google Cloud Console](https://console.cloud.google.com/)
2. Tạo project mới hoặc chọn project có sẵn
3. Vào **APIs & Services** > **Credentials**
4. Click **Create Credentials** > **OAuth 2.0 Client ID**
5. Chọn **Application type** = **Web application**
6. Đặt tên cho OAuth client
7. Thêm **Authorized redirect URIs**:
   - `http://localhost:8080/oauth/social?login_type=google` (cho development)
   - `https://yourdomain.com/oauth/social?login_type=google` (cho production)

## 2. Cấu hình Backend

Sau khi tạo OAuth client, bạn sẽ nhận được:
- **Client ID**: đã có trong code
- **Client Secret**: cần cập nhật

### Cập nhật application.yaml:

```yaml
google:
  oauth:
    client-id: "YOUR_ACTUAL_CLIENT_ID"
    client-secret: "YOUR_ACTUAL_CLIENT_SECRET"
    redirect-uri: "http://localhost:8080/oauth/social?login_type=google"
```

### Hoặc dùng environment variables:

```bash
export GOOGLE_CLIENT_ID="your_client_id"
export GOOGLE_CLIENT_SECRET="your_client_secret"
export GOOGLE_REDIRECT_URI="http://localhost:8080/oauth/social?login_type=google"
```

## 3. Cấu hình Frontend

Trong file `login-fixed.html`, cập nhật client_id:

```javascript
const GOOGLE_CONFIG = {
    client_id: 'YOUR_ACTUAL_CLIENT_ID',
    authorization_uri: 'https://accounts.google.com/o/oauth2/auth',
    redirect_uri: `${window.location.origin}/oauth/social?login_type=google`,
    scope: 'profile email'
};
```

## 4. Flow hoạt động

1. **Frontend**: User click "Đăng nhập bằng Google"
2. **Frontend**: Chuyển hướng đến Google OAuth với authorization URL
3. **Google**: User đăng nhập và cho phép ứng dụng truy cập
4. **Google**: Chuyển hướng về `redirect_uri` với `authorization_code`
5. **Frontend**: Gửi `authorization_code` đến backend endpoint `/api/v1/oauth/social`
6. **Backend**: Đổi `authorization_code` lấy `access_token` từ Google
7. **Backend**: Dùng `access_token` gọi Google API lấy thông tin user
8. **Backend**: Trả về thông tin user cho frontend
9. **Frontend**: Lưu thông tin user và chuyển hướng đến dashboard

## 5. Test

1. Khởi động backend: `./mvnw spring-boot:run -pl tinamusic-be`
2. Mở browser: `http://localhost:8080/login-fixed.html`
3. Click "Đăng nhập bằng Google"
4. Kiểm tra logs trong console để debug

## 6. Lưu ý bảo mật

- **Không commit client_secret vào git**
- Dùng environment variables cho production
- Validate state parameter để tránh CSRF
- Sử dụng HTTPS trong production

## 7. Endpoints

- **Frontend auth URL**: `/login-fixed.html`
- **Backend OAuth endpoint**: `/api/v1/oauth/social?code=...&login_type=google`
- **Google authorization**: `https://accounts.google.com/o/oauth2/auth`
- **Google token exchange**: `https://oauth2.googleapis.com/token`
- **Google user info**: `https://www.googleapis.com/oauth2/v2/userinfo`
