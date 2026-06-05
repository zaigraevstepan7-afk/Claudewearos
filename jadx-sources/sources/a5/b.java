package a5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, int i10) {
        super(str, "android.credentials.GetCredentialException.TYPE_USER_CANCELED");
        switch (i10) {
            case 1:
                super(str, "android.credentials.GetCredentialException.TYPE_INTERRUPTED");
                break;
            case 2:
            default:
                break;
            case 3:
                super(str, "android.credentials.GetCredentialException.TYPE_UNKNOWN");
                break;
        }
    }
}
