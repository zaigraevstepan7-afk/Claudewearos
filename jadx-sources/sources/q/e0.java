package q;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 extends vi.h implements ej.e {
    public final /* synthetic */ f0 A;
    public final /* synthetic */ mj.e B;

    /* renamed from: b, reason: collision with root package name */
    public mj.e f13058b;

    /* renamed from: c, reason: collision with root package name */
    public f0 f13059c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f13060d;

    /* renamed from: e, reason: collision with root package name */
    public int f13061e;

    /* renamed from: f, reason: collision with root package name */
    public int f13062f;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f13063z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, mj.e eVar, ti.c cVar) {
        super(cVar);
        this.A = f0Var;
        this.B = eVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        e0 e0Var = new e0(this.A, this.B, cVar);
        e0Var.f13063z = obj;
        return e0Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((mj.g) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        mj.g gVar;
        f0 f0Var;
        long[] jArr;
        int i10;
        mj.e eVar;
        ui.a aVar = ui.a.f17085a;
        int i11 = this.f13062f;
        if (i11 == 0) {
            uk.c.R(obj);
            gVar = (mj.g) this.f13063z;
            f0Var = this.A;
            d0 d0Var = f0Var.f13068b;
            jArr = d0Var.f13049c;
            i10 = d0Var.f13051e;
            eVar = this.B;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f13061e;
            jArr = this.f13060d;
            f0Var = this.f13059c;
            eVar = this.f13058b;
            gVar = (mj.g) this.f13063z;
            uk.c.R(obj);
        }
        if (i10 == Integer.MAX_VALUE) {
            return pi.o.f13011a;
        }
        int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
        eVar.f11822c = i10;
        Object obj2 = f0Var.f13068b.f13048b[i10];
        this.f13063z = gVar;
        this.f13058b = eVar;
        this.f13059c = f0Var;
        this.f13060d = jArr;
        this.f13061e = i12;
        this.f13062f = 1;
        gVar.b(obj2, this);
        return aVar;
    }
}
