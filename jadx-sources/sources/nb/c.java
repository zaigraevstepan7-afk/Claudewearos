package nb;

import f1.a1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.c f11978b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f11979c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f11980d;

    public /* synthetic */ c(ej.c cVar, a1 a1Var, a1 a1Var2, int i10) {
        this.f11977a = i10;
        this.f11978b = cVar;
        this.f11979c = a1Var;
        this.f11980d = a1Var2;
    }

    @Override // ej.a
    public final Object a() {
        xa.f fVar;
        String str;
        xa.f fVar2;
        String str2;
        switch (this.f11977a) {
            case 0:
                this.f11979c.setValue(Boolean.FALSE);
                a1 a1Var = this.f11980d;
                this.f11978b.invoke((String) a1Var.getValue());
                a1Var.setValue("");
                break;
            case 1:
                a1 a1Var2 = this.f11979c;
                ab.a aVar = (ab.a) a1Var2.getValue();
                if (aVar != null) {
                    int i10 = aVar.f252a;
                    a1Var2.setValue(null);
                    this.f11980d.setValue(Boolean.FALSE);
                    this.f11978b.invoke(new wa.l(i10));
                }
                break;
            case 2:
                a1 a1Var3 = this.f11979c;
                ab.a aVar2 = (ab.a) a1Var3.getValue();
                if (aVar2 != null && (fVar = aVar2.f253b) != null && (str = fVar.f19863b) != null) {
                    a1Var3.setValue(null);
                    this.f11980d.setValue(Boolean.FALSE);
                    this.f11978b.invoke(str);
                }
                break;
            default:
                a1 a1Var4 = this.f11979c;
                ab.a aVar3 = (ab.a) a1Var4.getValue();
                if (aVar3 != null && (fVar2 = aVar3.f253b) != null && (str2 = fVar2.f19863b) != null) {
                    a1Var4.setValue(null);
                    this.f11980d.setValue(Boolean.FALSE);
                    this.f11978b.invoke(str2);
                }
                break;
        }
        return pi.o.f13011a;
    }
}
