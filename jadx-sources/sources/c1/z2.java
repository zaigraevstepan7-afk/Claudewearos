package c1;

import com.anonlab.voidlauncher.LauncherApplication;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z2 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2939a;

    /* renamed from: b, reason: collision with root package name */
    public int f2940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z2(ej.c cVar, ti.c cVar2) {
        super(2, cVar2);
        this.f2939a = 16;
        this.f2941c = (vi.i) cVar;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [ej.c, vi.i] */
    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f2939a) {
            case 0:
                return new z2((b3) this.f2941c, cVar, 0);
            case 1:
                return new z2((y7) this.f2941c, cVar, 1);
            case 2:
                return new z2((i8) this.f2941c, cVar, 2);
            case 3:
                return new z2((d0.u) this.f2941c, this.f2940b, cVar, 3);
            case 4:
                return new z2((e0.v) this.f2941c, this.f2940b, cVar, 4);
            case 5:
                return new z2((t0.j) this.f2941c, cVar, 5);
            case 6:
                return new z2((t0.g) this.f2941c, cVar, 6);
            case 7:
                return new z2((k0.u0) this.f2941c, cVar, 7);
            case 8:
                return new z2((k3.d) this.f2941c, cVar, 8);
            case 9:
                return new z2((mi.o) this.f2941c, cVar, 9);
            case 10:
                return new z2((n6.a) this.f2941c, cVar, 10);
            case 11:
                return new z2((p2.p0) this.f2941c, cVar, 11);
            case 12:
                return new z2((u6.g) this.f2941c, cVar, 12);
            case 13:
                return new z2((v.e0) this.f2941c, cVar, 13);
            case 14:
                return new z2((v.j0) this.f2941c, cVar, 14);
            case 15:
                return new z2((v.d1) this.f2941c, cVar, 15);
            case 16:
                return new z2((vi.i) this.f2941c, cVar);
            case 17:
                return new z2((qj.r) this.f2941c, cVar, 17);
            case 18:
                return new z2((ej.c) this.f2941c, this.f2940b, cVar, 18);
            case 19:
                return new z2((x.k1) this.f2941c, cVar, 19);
            default:
                return new z2((LauncherApplication) this.f2941c, cVar, 20);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f2939a) {
            case 3:
                z2 z2Var = (z2) create((x.s1) obj, (ti.c) obj2);
                pi.o oVar = pi.o.f13011a;
                z2Var.invokeSuspend(oVar);
                break;
            case 4:
                z2 z2Var2 = (z2) create((x.s1) obj, (ti.c) obj2);
                pi.o oVar2 = pi.o.f13011a;
                z2Var2.invokeSuspend(oVar2);
                break;
            case 15:
                ((z2) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
                break;
            case 18:
                z2 z2Var3 = (z2) create((qj.z) obj, (ti.c) obj2);
                pi.o oVar3 = pi.o.f13011a;
                z2Var3.invokeSuspend(oVar3);
                break;
        }
        return ((z2) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fa, code lost:
    
        if (f1.s.v(getContext()).a(new f1.t0(r15, r2), r14) == r1) goto L64;
     */
    /* JADX WARN: Path cross not found for [B:57:0x00d3, B:60:0x00dc], limit reached: 245 */
    /* JADX WARN: Path cross not found for [B:60:0x00dc, B:57:0x00d3], limit reached: 245 */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Type inference failed for: r8v19, types: [ej.c, vi.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00de -> B:55:0x00cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00fa -> B:65:0x00fd). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.z2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(Object obj, int i10, ti.c cVar, int i11) {
        super(2, cVar);
        this.f2939a = i11;
        this.f2941c = obj;
        this.f2940b = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(Object obj, ti.c cVar, int i10) {
        super(2, cVar);
        this.f2939a = i10;
        this.f2941c = obj;
    }
}
