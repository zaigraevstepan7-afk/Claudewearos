package sa;

import f1.a1;
import p2.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 extends vi.h implements ej.e {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ t.c B;
    public final /* synthetic */ float C;
    public final /* synthetic */ a1 D;
    public final /* synthetic */ float E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ float G;
    public final /* synthetic */ ej.c H;

    /* renamed from: b, reason: collision with root package name */
    public float f14851b;

    /* renamed from: c, reason: collision with root package name */
    public int f14852c;

    /* renamed from: d, reason: collision with root package name */
    public int f14853d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f14854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ej.a f14855f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ qj.z f14856z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ej.a aVar, qj.z zVar, a1 a1Var, t.c cVar, float f10, a1 a1Var2, float f11, boolean z2, float f12, ej.c cVar2, ti.c cVar3) {
        super(cVar3);
        this.f14855f = aVar;
        this.f14856z = zVar;
        this.A = a1Var;
        this.B = cVar;
        this.C = f10;
        this.D = a1Var2;
        this.E = f11;
        this.F = z2;
        this.G = f12;
        this.H = cVar2;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        g0 g0Var = new g0(this.f14855f, this.f14856z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, cVar);
        g0Var.f14854e = obj;
        return g0Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((o0) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r3 == r2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r9 != r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        return r2;
     */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004b -> B:17:0x004e). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
