package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends vi.h implements ej.e {

    /* renamed from: b, reason: collision with root package name */
    public int f6345b;

    /* renamed from: c, reason: collision with root package name */
    public int f6346c;

    /* renamed from: d, reason: collision with root package name */
    public int f6347d;

    /* renamed from: e, reason: collision with root package name */
    public int f6348e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6349f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ k f6350z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ti.c cVar) {
        super(cVar);
        this.f6350z = kVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        j jVar = new j(this.f6350z, cVar);
        jVar.f6349f = obj;
        return jVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((mj.g) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        mj.g gVar;
        int i10;
        int i11;
        int i12;
        String strD;
        int i13;
        int i14;
        String str;
        k kVar = this.f6350z;
        q.b0 b0Var = kVar.f6355a;
        q.u uVar = kVar.f6357c;
        ui.a aVar = ui.a.f17085a;
        int i15 = this.f6348e;
        if (i15 == 0) {
            uk.c.R(obj);
            gVar = (mj.g) this.f6349f;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f6347d;
            i11 = this.f6346c;
            i12 = this.f6345b;
            gVar = (mj.g) this.f6349f;
            uk.c.R(obj);
        }
        if (i12 >= Math.min(kVar.f6358d + 10, uVar.f13137b)) {
            return pi.o.f13011a;
        }
        int i16 = i12 + 1;
        int iC = uVar.c(i12);
        switch (iC) {
            case 0:
                strD = "up";
                break;
            case 1:
                Object objF = b0Var.f(i11);
                i11++;
                strD = "down " + objF;
                break;
            case 2:
                strD = "remove " + uVar.c(i16) + ' ' + uVar.c(i12 + 2);
                i16 = i12 + 3;
                break;
            case 3:
                strD = "move " + uVar.c(i16) + ' ' + uVar.c(i12 + 2) + ' ' + uVar.c(i12 + 3);
                i16 = i12 + 4;
                break;
            case 4:
                strD = "clear";
                break;
            case 5:
                i13 = i12 + 2;
                int iC2 = uVar.c(i16);
                i14 = i11 + 1;
                str = "insertBottomUp " + iC2 + ' ' + b0Var.f(i11);
                int i17 = i13;
                strD = str;
                i16 = i17;
                i11 = i14;
                break;
            case 6:
                i13 = i12 + 2;
                int iC3 = uVar.c(i16);
                i14 = i11 + 1;
                str = "insertTopDown " + iC3 + ' ' + b0Var.f(i11);
                int i172 = i13;
                strD = str;
                i16 = i172;
                i11 = i14;
                break;
            case 7:
                Object objF2 = b0Var.f(i11);
                fj.l.d(objF2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                fj.y.c(2, objF2);
                i11 += 2;
                strD = "apply " + ((ej.e) objF2);
                break;
            case 8:
                strD = "reuse " + kVar.f6356b.f(i10);
                i10++;
                break;
            case 9:
                strD = "recompose pending";
                break;
            default:
                strD = m6.a.d(iC, "unknown op: ");
                break;
        }
        this.f6349f = gVar;
        this.f6345b = i16;
        this.f6346c = i11;
        this.f6347d = i10;
        this.f6348e = 1;
        gVar.b(i12 + ": " + strD, this);
        return aVar;
    }
}
