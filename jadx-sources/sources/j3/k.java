package j3;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8694a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8695b;

    public k(boolean z2, boolean z10) {
        this.f8694a = z2;
        this.f8695b = z10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f8694a);
        textPaint.setStrikeThruText(this.f8695b);
    }
}
