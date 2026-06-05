package m5;

import java.io.Serializable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v extends vi.c {
    public int A;

    /* renamed from: a, reason: collision with root package name */
    public boolean f11384a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11385b;

    /* renamed from: c, reason: collision with root package name */
    public fj.v f11386c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f11387d;

    /* renamed from: e, reason: collision with root package name */
    public int f11388e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f11389f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ z f11390z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, vi.c cVar) {
        super(cVar);
        this.f11390z = zVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f11389f = obj;
        this.A |= Integer.MIN_VALUE;
        return z.f(this.f11390z, false, this);
    }
}
