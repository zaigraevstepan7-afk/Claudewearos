package v2;

import f1.r2;
import w2.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends fj.m implements ej.e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f17610b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f17611c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f17612d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f17613e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17614a;

    static {
        int i10 = 2;
        f17610b = new e(i10, 0);
        f17611c = new e(i10, 1);
        f17612d = new e(i10, 2);
        f17613e = new e(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11) {
        super(i10);
        this.f17614a = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17614a) {
            case 0:
                ((Number) obj2).intValue();
                ((f0) ((h) obj)).getClass();
                break;
            case 1:
                ((f0) ((h) obj)).c0((t2.q0) obj2);
                break;
            case 2:
                ((f0) ((h) obj)).d0((v1.o) obj2);
                break;
            default:
                f1.u uVar = (f1.u) obj2;
                f0 f0Var = (f0) ((h) obj);
                f0Var.U = uVar;
                b1 b1Var = f0Var.Y;
                r2 r2Var = w2.f1.f18262h;
                p1.i iVar = (p1.i) uVar;
                iVar.getClass();
                f0Var.Z((s3.c) f1.s.H(iVar, r2Var));
                s3.m mVar = (s3.m) f1.s.H(iVar, w2.f1.f18267n);
                if (f0Var.S != mVar) {
                    f0Var.S = mVar;
                    f0Var.D();
                    f0 f0VarU = f0Var.u();
                    if (f0VarU != null) {
                        f0VarU.B();
                    } else {
                        r1 r1Var = f0Var.G;
                        if (r1Var != null) {
                            ((w2.t) r1Var).invalidate();
                        }
                    }
                    f0Var.C();
                    for (v1.n nVar = b1Var.f17586f; nVar != null; nVar = nVar.f17570f) {
                        nVar.j0();
                    }
                }
                f0Var.e0((h2) f1.s.H(iVar, w2.f1.f18273t));
                v1.n nVar2 = b1Var.f17586f;
                if ((nVar2.f17568d & 32768) != 0) {
                    while (nVar2 != null) {
                        if ((nVar2.f17567c & 32768) != 0) {
                            k kVarE = nVar2;
                            ?? eVar = 0;
                            while (kVarE != 0) {
                                if (kVarE instanceof i) {
                                    v1.n nVar3 = ((v1.n) ((i) kVarE)).f17565a;
                                    if (nVar3.G) {
                                        j1.c(nVar3);
                                    } else {
                                        nVar3.C = true;
                                    }
                                } else if ((kVarE.f17567c & 32768) != 0 && (kVarE instanceof k)) {
                                    v1.n nVar4 = kVarE.I;
                                    int i10 = 0;
                                    kVarE = kVarE;
                                    eVar = eVar;
                                    while (nVar4 != null) {
                                        if ((nVar4.f17567c & 32768) != 0) {
                                            i10++;
                                            eVar = eVar;
                                            if (i10 == 1) {
                                                kVarE = nVar4;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new g1.e(new v1.n[16]);
                                                }
                                                if (kVarE != 0) {
                                                    eVar.b(kVarE);
                                                    kVarE = 0;
                                                }
                                                eVar.b(nVar4);
                                            }
                                        }
                                        nVar4 = nVar4.f17570f;
                                        kVarE = kVarE;
                                        eVar = eVar;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                kVarE = n.e(eVar);
                            }
                        }
                        if ((nVar2.f17568d & 32768) != 0) {
                            nVar2 = nVar2.f17570f;
                        }
                    }
                }
                break;
        }
        return pi.o.f13011a;
    }
}
