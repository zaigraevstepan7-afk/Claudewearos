package w3;

import c1.z3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f18505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.a f18506b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f18507c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f18508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s3.m f18509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(x xVar, ej.a aVar, d0 d0Var, String str, s3.m mVar) {
        super(1);
        this.f18505a = xVar;
        this.f18506b = aVar;
        this.f18507c = d0Var;
        this.f18508d = str;
        this.f18509e = mVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        x xVar = this.f18505a;
        xVar.I.addView(xVar, xVar.J);
        xVar.o(this.f18506b, this.f18507c, this.f18508d, this.f18509e);
        return new z3(xVar, 14);
    }
}
