package jg;

import com.google.android.gms.internal.p002firebaseauthapi.zzxy;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final qd.a f8893a = new qd.a("GetTokenResultFactory", new String[0]);

    public static ig.m a(String str) {
        Map map;
        try {
            map = j.b(str);
        } catch (zzxy e10) {
            f8893a.b("Error parsing token claims", e10, new Object[0]);
            map = new HashMap();
        }
        ig.m mVar = new ig.m();
        mVar.f8554a = str;
        mVar.f8555b = map;
        return mVar;
    }
}
