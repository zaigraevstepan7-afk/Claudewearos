package k0;

import android.view.textclassifier.TextClassifier;
import x.j2;
import x.l2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j1 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9137a;

    /* renamed from: b, reason: collision with root package name */
    public int f9138b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f9139c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9142f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(long j, CharSequence charSequence, ti.c cVar, v0.p pVar) {
        super(2, cVar);
        this.f9137a = 3;
        this.f9141e = pVar;
        this.f9142f = charSequence;
        this.f9139c = j;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f9137a) {
            case 0:
                return new j1((f1.a1) this.f9141e, this.f9139c, (z.k) this.f9142f, cVar, 0);
            case 1:
                return new j1((q0.g) this.f9140d, this.f9139c, (r0.f) this.f9141e, (q0.f) this.f9142f, cVar);
            case 2:
                return new j1((qj.e1) this.f9141e, this.f9139c, (z.k) this.f9142f, cVar, 2);
            case 3:
                v0.p pVar = (v0.p) this.f9141e;
                j1 j1Var = new j1(this.f9139c, (CharSequence) this.f9142f, cVar, pVar);
                j1Var.f9140d = obj;
                return j1Var;
            default:
                j1 j1Var2 = new j1((l2) this.f9141e, this.f9139c, (fj.s) this.f9142f, cVar, 4);
                j1Var2.f9140d = obj;
                return j1Var2;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9137a) {
            case 0:
                return ((j1) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 1:
                return ((j1) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 2:
                return ((j1) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 3:
                return ((j1) create((TextClassifier) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            default:
                return ((j1) create((j2) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.j1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(Object obj, long j, Object obj2, ti.c cVar, int i10) {
        super(2, cVar);
        this.f9137a = i10;
        this.f9141e = obj;
        this.f9139c = j;
        this.f9142f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(q0.g gVar, long j, r0.f fVar, q0.f fVar2, ti.c cVar) {
        super(2, cVar);
        this.f9137a = 1;
        this.f9140d = gVar;
        this.f9139c = j;
        this.f9141e = fVar;
        this.f9142f = fVar2;
    }
}
