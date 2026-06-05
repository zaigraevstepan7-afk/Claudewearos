package w3;

import c1.z3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f18473b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(v vVar, int i10) {
        super(1);
        this.f18472a = i10;
        this.f18473b = vVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f18472a) {
            case 0:
                v vVar = this.f18473b;
                vVar.show();
                return new z3(vVar, 13);
            default:
                v vVar2 = this.f18473b;
                if (vVar2.f18544f.f18536a) {
                    vVar2.f18543e.a();
                }
                return pi.o.f13011a;
        }
    }
}
