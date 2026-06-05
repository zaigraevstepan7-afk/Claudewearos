package z4;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, Bundle bundle, int i10) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
        switch (i10) {
            case 1:
                super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused) {
                    }
                }
                throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
            default:
                if (str.length() <= 0) {
                    throw new IllegalArgumentException("password should not be empty");
                }
                return;
        }
    }
}
