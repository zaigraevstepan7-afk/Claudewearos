package j1;

import f1.d2;
import f1.t1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r extends j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final r f8651d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f8652e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f8653f;

    /* renamed from: g, reason: collision with root package name */
    public static final r f8654g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8655c;

    static {
        int i10 = 1;
        f8651d = new r(i10, 2, 0);
        int i11 = 1;
        f8652e = new r(i11, i11, 1);
        f8653f = new r(i10, 2, 2);
        int i12 = 1;
        f8654g = new r(i12, i12, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10, int i11, int i12) {
        super(i10, i11);
        this.f8655c = i12;
    }

    @Override // j1.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, f1.a aVar, i1.k kVar2, p1.k kVar3, k0 k0Var) {
        switch (this.f8655c) {
            case 0:
                Object objA = ((ej.a) kVar.g(0)).a();
                i1.b bVar = (i1.b) kVar.g(1);
                int iF = kVar.f(0);
                bVar.getClass();
                kVar2.U(kVar2.c(bVar), objA);
                aVar.l(iF, objA);
                aVar.e(objA);
                break;
            case 1:
                i1.b bVar2 = (i1.b) kVar.g(0);
                int iF2 = kVar.f(0);
                aVar.i();
                bVar2.getClass();
                aVar.c(iF2, kVar2.D(kVar2.c(bVar2)));
                break;
            case 2:
                Object objG = kVar.g(0);
                i1.b bVar3 = (i1.b) kVar.g(1);
                int iF3 = kVar.f(0);
                if (objG instanceof d2) {
                    kVar3.h((d2) objG);
                }
                Object objK = kVar2.K(kVar2.c(bVar3), iF3, objG);
                if (!(objK instanceof d2)) {
                    if (objK instanceof t1) {
                        ((t1) objK).d();
                        break;
                    }
                } else {
                    kVar3.e((d2) objK);
                    break;
                }
                break;
            default:
                Object objG2 = kVar.g(0);
                int iF4 = kVar.f(0);
                if (objG2 instanceof d2) {
                    kVar3.h((d2) objG2);
                }
                Object objK2 = kVar2.K(kVar2.f8154t, iF4, objG2);
                if (!(objK2 instanceof d2)) {
                    if (objK2 instanceof t1) {
                        ((t1) objK2).d();
                        break;
                    }
                } else {
                    kVar3.e((d2) objK2);
                    break;
                }
                break;
        }
    }

    @Override // j1.j0
    public i1.b b(androidx.datastore.preferences.protobuf.k kVar) {
        switch (this.f8655c) {
            case 0:
                return (i1.b) kVar.g(1);
            case 1:
                return (i1.b) kVar.g(0);
            default:
                return super.b(kVar);
        }
    }
}
