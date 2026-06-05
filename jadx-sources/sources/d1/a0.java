package d1;

import c1.j8;
import qj.l1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a0 extends vi.h implements ej.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4465b;

    /* renamed from: c, reason: collision with root package name */
    public int f4466c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4467d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4468e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4469f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f4470z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ak.x xVar, p2.h hVar, k0.b1 b1Var, ti.c cVar) {
        super(cVar);
        this.f4465b = 4;
        this.f4468e = xVar;
        this.f4469f = hVar;
        this.f4470z = b1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f4465b) {
            case 0:
                a0 a0Var = new a0((qj.z) this.f4469f, (j8) this.f4470z, cVar);
                a0Var.f4467d = obj;
                return a0Var;
            case 1:
                a0 a0Var2 = new a0((g0.h0) this.f4470z, cVar, 1);
                a0Var2.f4467d = obj;
                return a0Var2;
            case 2:
                a0 a0Var3 = new a0((l1) this.f4470z, cVar, 2);
                a0Var3.f4467d = obj;
                return a0Var3;
            case 3:
                a0 a0Var4 = new a0((s0.c) this.f4470z, cVar, 3);
                a0Var4.f4467d = obj;
                return a0Var4;
            default:
                a0 a0Var5 = new a0((ak.x) this.f4468e, (p2.h) this.f4469f, (k0.b1) this.f4470z, cVar);
                a0Var5.f4467d = obj;
                return a0Var5;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4465b) {
            case 0:
                ((a0) create((p2.o0) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
                break;
        }
        return ((a0) create((p2.o0) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04f2  */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v53, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:187:0x0319 -> B:189:0x031d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:228:0x03c6 -> B:230:0x03da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:248:0x044a -> B:250:0x044e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:268:0x04c1 -> B:270:0x04c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x01b0 -> B:89:0x01b4). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj, ti.c cVar, int i10) {
        super(cVar);
        this.f4465b = i10;
        this.f4470z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(qj.z zVar, j8 j8Var, ti.c cVar) {
        super(cVar);
        this.f4465b = 0;
        this.f4469f = zVar;
        this.f4470z = j8Var;
    }
}
