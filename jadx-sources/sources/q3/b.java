package q3;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import b2.e;
import c2.u0;
import f1.j1;
import f1.s;
import f1.y;
import o3.j;
import q0.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f13197a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13198b;

    /* renamed from: c, reason: collision with root package name */
    public final j1 f13199c = s.A(new e(9205357640488583168L));

    /* renamed from: d, reason: collision with root package name */
    public final y f13200d = s.q(new k(this, 1));

    public b(u0 u0Var, float f10) {
        this.f13197a = u0Var;
        this.f13198b = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j.c(textPaint, this.f13198b);
        textPaint.setShader((Shader) this.f13200d.getValue());
    }
}
