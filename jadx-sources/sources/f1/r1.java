package f1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6434a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6435b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6436c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6437d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6438e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6439f;

    public r1(m.o oVar) {
        this.f6438e = null;
        this.f6439f = null;
        this.f6434a = false;
        this.f6435b = false;
        this.f6437d = oVar;
    }

    public void a() {
        m.o oVar = (m.o) this.f6437d;
        Drawable buttonDrawable = oVar.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f6434a || this.f6435b) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f6434a) {
                    drawableMutate.setTintList((ColorStateList) this.f6438e);
                }
                if (this.f6435b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f6439f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(oVar.getDrawableState());
                }
                oVar.setButtonDrawable(drawableMutate);
            }
        }
    }

    public Object b() {
        if (this.f6434a) {
            return null;
        }
        Object obj = this.f6439f;
        if (obj != null) {
            return obj;
        }
        n.b("Unexpected form of a provided value");
        throw new b3.e();
    }

    public r1(q1 q1Var, Object obj, boolean z2, n2 n2Var, boolean z10) {
        this.f6437d = q1Var;
        this.f6434a = z2;
        this.f6438e = n2Var;
        this.f6435b = z10;
        this.f6439f = obj;
        this.f6436c = true;
    }
}
