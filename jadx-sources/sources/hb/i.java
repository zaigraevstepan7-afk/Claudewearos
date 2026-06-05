package hb;

import fj.u;
import p2.o0;
import p2.w;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends vi.h implements ej.e {
    public long A;
    public long B;
    public int C;
    public int D;
    public int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ ej.c H;
    public final /* synthetic */ ej.e I;
    public final /* synthetic */ ej.a J;
    public final /* synthetic */ ej.c K;

    /* renamed from: b, reason: collision with root package name */
    public w f7815b;

    /* renamed from: c, reason: collision with root package name */
    public o0 f7816c;

    /* renamed from: d, reason: collision with root package name */
    public ej.e f7817d;

    /* renamed from: e, reason: collision with root package name */
    public o0 f7818e;

    /* renamed from: f, reason: collision with root package name */
    public u f7819f;

    /* renamed from: z, reason: collision with root package name */
    public long f7820z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ej.c cVar, ej.e eVar, ej.a aVar, ej.c cVar2, ti.c cVar3) {
        super(cVar3);
        this.H = cVar;
        this.I = eVar;
        this.J = aVar;
        this.K = cVar2;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        i iVar = new i(this.H, this.I, this.J, this.K, cVar);
        iVar.G = obj;
        return iVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((o0) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r4 == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ed, code lost:
    
        if (r9 == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015e  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ed -> B:39:0x00f0). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
