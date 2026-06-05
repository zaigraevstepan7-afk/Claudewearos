package s1;

import f1.c2;
import p1.l;
import t1.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public j f14714a;

    /* renamed from: b, reason: collision with root package name */
    public e f14715b;

    /* renamed from: c, reason: collision with root package name */
    public String f14716c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14717d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f14718e;

    /* renamed from: f, reason: collision with root package name */
    public d f14719f;

    /* renamed from: z, reason: collision with root package name */
    public final q0.k f14720z = new q0.k(this, 6);

    public a(j jVar, e eVar, String str, Object obj, Object[] objArr) {
        this.f14714a = jVar;
        this.f14715b = eVar;
        this.f14716c = str;
        this.f14717d = obj;
        this.f14718e = objArr;
    }

    @Override // f1.c2
    public final void a() {
        d dVar = this.f14719f;
        if (dVar != null) {
            ((l) dVar).I();
        }
    }

    public final void b() throws Throwable {
        String strA;
        e eVar = this.f14715b;
        if (this.f14719f != null) {
            throw new IllegalArgumentException(("entry(" + this.f14719f + ") is not null").toString());
        }
        if (eVar != null) {
            q0.k kVar = this.f14720z;
            Object objA = kVar.a();
            if (objA == null || eVar.b(objA)) {
                this.f14719f = eVar.e(this.f14716c, kVar);
                return;
            }
            if (objA instanceof o) {
                o oVar = (o) objA;
                if (oVar.c() == f1.f.f6290d || oVar.c() == f1.f.f6293z || oVar.c() == f1.f.f6291e) {
                    strA = "MutableState containing " + oVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strA = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strA = k.a(objA);
            }
            throw new IllegalArgumentException(strA);
        }
    }

    @Override // f1.c2
    public final void c() {
        d dVar = this.f14719f;
        if (dVar != null) {
            ((l) dVar).I();
        }
    }

    @Override // f1.c2
    public final void d() throws Throwable {
        b();
    }
}
