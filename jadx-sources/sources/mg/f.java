package mg;

import android.text.TextUtils;
import cg.m;
import com.google.android.gms.common.internal.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final rg.l f11676a;

    /* renamed from: b, reason: collision with root package name */
    public final rg.e f11677b;

    /* renamed from: c, reason: collision with root package name */
    public rg.k f11678c;

    public f(rg.e eVar, rg.l lVar) {
        this.f11676a = lVar;
        this.f11677b = eVar;
    }

    public static f b() {
        cg.i iVarE = cg.i.e();
        iVarE.b();
        m mVar = iVarE.f3369c;
        String string = mVar.f3383c;
        String str = mVar.f3387g;
        if (string == null) {
            iVarE.b();
            if (str == null) {
                throw new c("Failed to get FirebaseDatabase instance: Can't determine Firebase Database URL. Be sure to include a Project ID in your configuration.");
            }
            StringBuilder sb2 = new StringBuilder("https://");
            iVarE.b();
            sb2.append(str);
            sb2.append("-default-rtdb.firebaseio.com");
            string = sb2.toString();
        }
        return c(iVarE, string);
    }

    public static synchronized f c(cg.i iVar, String str) {
        g gVar;
        ug.h hVarD;
        if (TextUtils.isEmpty(str)) {
            throw new c("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
        }
        gVar = (g) iVar.c(g.class);
        e0.j(gVar, "Firebase Database component is not present.");
        hVarD = ug.l.d(str);
        if (!hVarD.f17078b.isEmpty()) {
            throw new c("Specified Database URL '" + str + "' is invalid. It should point to the root of a Firebase Database but it includes a path: " + hVarD.f17078b.toString());
        }
        return gVar.a(hVarD.f17077a);
    }

    public final synchronized void a() {
        if (this.f11678c == null) {
            this.f11676a.getClass();
            this.f11678c = rg.m.a(this.f11677b, this.f11676a);
        }
    }

    public final d d() {
        a();
        return new d(this.f11678c, rg.h.f14414d);
    }

    public final d e(String str) {
        a();
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in FirebaseDatabase.getReference()");
        }
        ug.m.b(str);
        return new d(this.f11678c, new rg.h(str));
    }
}
