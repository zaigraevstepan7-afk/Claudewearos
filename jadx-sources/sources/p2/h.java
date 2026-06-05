package p2;

import java.util.List;
import v0.u0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12698a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12699b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12700c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12701d;

    public h(q.p pVar, mh.g gVar) {
        this.f12698a = 0;
        this.f12700c = pVar;
        this.f12701d = gVar;
    }

    public boolean a(long j) {
        Object obj;
        List list = (List) ((mh.g) this.f12701d).f11707b;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
            if (v.e(((y) obj).f12779a, j)) {
                break;
            }
            i10++;
        }
        y yVar = (y) obj;
        if (yVar != null) {
            return yVar.f12786h;
        }
        return false;
    }

    public v0.i b() {
        androidx.datastore.preferences.protobuf.k kVar = (androidx.datastore.preferences.protobuf.k) this.f12701d;
        int i10 = kVar.f954b;
        int i11 = kVar.f955c;
        return i10 < i11 ? v0.i.f17402b : i10 > i11 ? v0.i.f17401a : v0.i.f17403c;
    }

    public void c() {
        if (this.f12699b) {
            u0.b((u0) this.f12701d, (g3.m0) this.f12700c);
        }
    }

    public long d(l3.t tVar, long j, boolean z2, l7.n nVar) {
        u0 u0Var = (u0) this.f12701d;
        long jC = u0.c(u0Var, tVar, j, z2, false, nVar, false, null);
        if (!g3.m0.a(jC, (g3.m0) this.f12700c)) {
            this.f12699b = false;
        }
        u0Var.q(g3.m0.c(jC) ? k0.k0.f9152c : k0.k0.f9151b);
        return jC;
    }

    public String toString() {
        switch (this.f12698a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("http");
                sb2.append(this.f12699b ? "s" : "");
                sb2.append("://");
                sb2.append((String) this.f12700c);
                return sb2.toString();
            case 2:
                return "SingleSelectionLayout(isStartHandle=" + this.f12699b + ", crossed=" + b() + ", info=\n\t" + ((androidx.datastore.preferences.protobuf.k) this.f12701d) + ')';
            default:
                return super.toString();
        }
    }

    public h(String str, String str2, boolean z2) {
        this.f12698a = 1;
        this.f12700c = str;
        this.f12701d = str2;
        this.f12699b = z2;
    }

    public h(boolean z2, v0.u uVar, androidx.datastore.preferences.protobuf.k kVar) {
        this.f12698a = 2;
        this.f12699b = z2;
        this.f12700c = uVar;
        this.f12701d = kVar;
    }

    public h(u0 u0Var) {
        this.f12698a = 3;
        this.f12701d = u0Var;
        this.f12699b = true;
    }
}
