package p7;

import android.os.Build;
import java.util.HashSet;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class c implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f12805c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f12806a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12807b;

    public c(String str, String str2) {
        this.f12806a = str;
        this.f12807b = str2;
        f12805c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f12803a;
        String str = this.f12807b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }
}
