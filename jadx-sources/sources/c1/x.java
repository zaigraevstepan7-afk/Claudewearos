package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x implements tj.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1.q f2844b;

    public /* synthetic */ x(t1.q qVar, int i10) {
        this.f2843a = i10;
        this.f2844b = qVar;
    }

    @Override // tj.f
    public final Object b(Object obj, ti.c cVar) {
        switch (this.f2843a) {
            case 0:
                z.j jVar = (z.j) obj;
                boolean z2 = jVar instanceof z.h;
                t1.q qVar = this.f2844b;
                if (z2) {
                    qVar.add(jVar);
                } else if (jVar instanceof z.i) {
                    qVar.remove(((z.i) jVar).f20345a);
                } else if (jVar instanceof z.d) {
                    qVar.add(jVar);
                } else if (jVar instanceof z.e) {
                    qVar.remove(((z.e) jVar).f20337a);
                } else if (jVar instanceof z.m) {
                    qVar.add(jVar);
                } else if (jVar instanceof z.n) {
                    qVar.remove(((z.n) jVar).f20349a);
                } else if (jVar instanceof z.l) {
                    qVar.remove(((z.l) jVar).f20347a);
                }
                break;
            case 1:
                z.j jVar2 = (z.j) obj;
                boolean z10 = jVar2 instanceof z.h;
                t1.q qVar2 = this.f2844b;
                if (z10) {
                    qVar2.add(jVar2);
                } else if (jVar2 instanceof z.i) {
                    qVar2.remove(((z.i) jVar2).f20345a);
                } else if (jVar2 instanceof z.d) {
                    qVar2.add(jVar2);
                } else if (jVar2 instanceof z.e) {
                    qVar2.remove(((z.e) jVar2).f20337a);
                } else if (jVar2 instanceof z.m) {
                    qVar2.add(jVar2);
                } else if (jVar2 instanceof z.n) {
                    qVar2.remove(((z.n) jVar2).f20349a);
                } else if (jVar2 instanceof z.l) {
                    qVar2.remove(((z.l) jVar2).f20347a);
                } else if (jVar2 instanceof z.b) {
                    qVar2.add(jVar2);
                } else if (jVar2 instanceof z.c) {
                    qVar2.remove(((z.c) jVar2).f20336a);
                } else if (jVar2 instanceof z.a) {
                    qVar2.remove(((z.a) jVar2).f20335a);
                }
                break;
            default:
                z.j jVar3 = (z.j) obj;
                boolean z11 = jVar3 instanceof z.m;
                t1.q qVar3 = this.f2844b;
                if (z11) {
                    qVar3.add(jVar3);
                } else if (jVar3 instanceof z.n) {
                    qVar3.remove(((z.n) jVar3).f20349a);
                } else if (jVar3 instanceof z.l) {
                    qVar3.remove(((z.l) jVar3).f20347a);
                } else if (jVar3 instanceof z.b) {
                    qVar3.add(jVar3);
                } else if (jVar3 instanceof z.c) {
                    qVar3.remove(((z.c) jVar3).f20336a);
                } else if (jVar3 instanceof z.a) {
                    qVar3.remove(((z.a) jVar3).f20335a);
                }
                break;
        }
        return pi.o.f13011a;
    }
}
