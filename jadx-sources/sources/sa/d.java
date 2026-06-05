package sa;

import f1.f1;
import f1.g1;
import java.util.List;
import k0.l1;
import p2.o0;
import x.r1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends vi.h implements ej.e {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14824b;

    /* renamed from: c, reason: collision with root package name */
    public int f14825c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f14826d;

    /* renamed from: e, reason: collision with root package name */
    public Object f14827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14828f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f14829z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, pi.c cVar, Object obj2, Object obj3, Object obj4, ti.c cVar2, int i10) {
        super(cVar2);
        this.f14824b = i10;
        this.f14827e = obj;
        this.f14828f = cVar;
        this.f14829z = obj2;
        this.A = obj3;
        this.B = obj4;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f14824b) {
            case 0:
                d dVar = new d((List) this.f14827e, (ej.c) this.f14828f, (g1) this.f14829z, (f1) this.A, (f1) this.B, cVar, 0);
                dVar.f14826d = obj;
                return dVar;
            case 1:
                d dVar2 = new d((s1.g) this.f14827e, (ab.a0) this.f14828f, (ej.e) this.f14829z, (ej.a) this.A, (c1.l) this.B, cVar, 1);
                dVar2.f14826d = obj;
                return dVar2;
            case 2:
                d dVar3 = new d((ej.c) this.f14828f, (ej.e) this.f14829z, (ej.a) this.A, (ej.a) this.B, cVar, 2);
                dVar3.f14826d = obj;
                return dVar3;
            default:
                d dVar4 = new d((qj.z) this.f14828f, (l1) this.f14829z, (ab.i) this.A, (r1) this.B, cVar, 3);
                dVar4.f14826d = obj;
                return dVar4;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        o0 o0Var = (o0) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f14824b) {
        }
        return ((d) create(o0Var, cVar)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0153, code lost:
    
        if (r0 == r14) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ea, code lost:
    
        if (r1 == r6) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0215, code lost:
    
        if (r1 != r6) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0215 -> B:85:0x0219). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, pi.c cVar, pi.c cVar2, Object obj2, ti.c cVar3, int i10) {
        super(cVar3);
        this.f14824b = i10;
        this.f14828f = obj;
        this.f14829z = cVar;
        this.A = cVar2;
        this.B = obj2;
    }
}
