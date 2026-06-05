package j3;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f8690a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8691b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8692c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8693d;

    public j(float f10, float f11, float f12, int i10) {
        this.f8690a = i10;
        this.f8691b = f10;
        this.f8692c = f11;
        this.f8693d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f8693d, this.f8691b, this.f8692c, this.f8690a);
    }
}
