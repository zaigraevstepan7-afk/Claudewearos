package jb;

import f1.a1;
import lb.q3;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8796a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f8797b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f8798c;

    public /* synthetic */ a(a1 a1Var, a1 a1Var2, int i10) {
        this.f8796a = i10;
        this.f8797b = a1Var;
        this.f8798c = a1Var2;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f8796a) {
            case 0:
                this.f8798c.setValue((h) this.f8797b.getValue());
                break;
            case 1:
                this.f8797b.setValue(null);
                this.f8798c.setValue(Boolean.FALSE);
                break;
            case 2:
                this.f8797b.setValue(null);
                q3.D(this.f8798c, false);
                break;
            case 3:
                this.f8797b.setValue(Boolean.FALSE);
                this.f8798c.setValue(Boolean.TRUE);
                break;
            case 4:
                a1 a1Var = this.f8797b;
                if (((Boolean) a1Var.getValue()).booleanValue()) {
                    a1Var.setValue(Boolean.FALSE);
                } else {
                    this.f8798c.setValue(Boolean.TRUE);
                }
                return o.f13011a;
            case 5:
                this.f8797b.setValue(Boolean.FALSE);
                this.f8798c.setValue("");
                break;
            case 6:
                this.f8797b.setValue(Boolean.FALSE);
                this.f8798c.setValue(Boolean.TRUE);
                break;
            case 7:
                this.f8797b.setValue(null);
                ra.b.e(this.f8798c, false);
                break;
            case 8:
                this.f8797b.setValue(null);
                ra.b.e(this.f8798c, false);
                break;
            default:
                this.f8797b.setValue(Boolean.FALSE);
                this.f8798c.setValue("");
                break;
        }
        return o.f13011a;
    }
}
