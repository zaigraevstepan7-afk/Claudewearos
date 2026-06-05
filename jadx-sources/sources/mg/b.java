package mg;

import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f11669c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f11670d;

    /* renamed from: a, reason: collision with root package name */
    public final int f11671a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11672b;

    static {
        HashMap map = new HashMap();
        f11669c = map;
        map.put(-1, "The transaction needs to be run again with current data");
        map.put(-2, "The server indicated that this operation failed");
        map.put(-3, "This client does not have permission to perform this operation");
        map.put(-4, "The operation had to be aborted due to a network disconnect");
        map.put(-6, "The supplied auth token has expired");
        map.put(-7, "The supplied auth token was invalid");
        map.put(-8, "The transaction had too many retries");
        map.put(-9, "The transaction was overridden by a subsequent set");
        map.put(-10, "The service is unavailable");
        map.put(-11, "User code called from the Firebase Database runloop threw an exception:\n");
        map.put(-24, "The operation could not be performed due to a network error");
        map.put(-25, "The write was canceled by the user.");
        map.put(-999, "An unknown error occurred");
        HashMap map2 = new HashMap();
        f11670d = map2;
        map2.put("datastale", -1);
        map2.put("failure", -2);
        map2.put("permission_denied", -3);
        map2.put("disconnected", -4);
        map2.put("expired_token", -6);
        map2.put("invalid_token", -7);
        map2.put("maxretries", -8);
        map2.put("overriddenbyset", -9);
        map2.put("unavailable", -10);
        map2.put("network_error", -24);
        map2.put("write_canceled", -25);
    }

    public b(int i10, String str) {
        this.f11671a = i10;
        this.f11672b = str;
    }

    public static b a(String str, String str2) {
        Integer num = (Integer) f11670d.get(str.toLowerCase(Locale.US));
        if (num == null) {
            num = -999;
        }
        if (str2 == null) {
            str2 = (String) f11669c.get(num);
        }
        return new b(num.intValue(), str2);
    }

    public final String toString() {
        return "DatabaseError: " + this.f11672b;
    }
}
