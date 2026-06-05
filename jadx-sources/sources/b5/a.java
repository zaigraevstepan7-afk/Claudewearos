package b5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1574a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i10) {
        this("androidx.credentials.TYPE_ABORT_ERROR");
        switch (i10) {
            case 1:
                this("androidx.credentials.TYPE_CONSTRAINT_ERROR");
                break;
            case 3:
                this("androidx.credentials.TYPE_DATA_ERROR");
                break;
            case 4:
                this("androidx.credentials.TYPE_ENCODING_ERROR");
                break;
            case 10:
                this("androidx.credentials.TYPE_INVALID_STATE_ERROR");
                break;
            case 12:
                this("androidx.credentials.TYPE_NETWORK_ERROR");
                break;
            case 14:
                this("androidx.credentials.TYPE_NOT_ALLOWED_ERROR");
                break;
            case 16:
                this("androidx.credentials.TYPE_NOT_READABLE_ERROR");
                break;
            case 17:
                this("androidx.credentials.TYPE_NOT_SUPPORTED_ERROR");
                break;
            case 22:
                this("androidx.credentials.TYPE_SECURITY_ERROR");
                break;
            case 24:
                this("androidx.credentials.TYPE_TIMEOUT_ERROR");
                break;
            case 26:
                this("androidx.credentials.TYPE_UNKNOWN_ERROR");
                break;
            default:
                break;
        }
    }

    public a(String str) {
        this.f1574a = str;
    }
}
