package i3;

import android.text.TextPaint;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends uk.c {

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f8339d;

    /* renamed from: e, reason: collision with root package name */
    public final TextPaint f8340e;

    public b(CharSequence charSequence, TextPaint textPaint) {
        this.f8339d = charSequence;
        this.f8340e = textPaint;
    }

    @Override // uk.c
    public final int G(int i10) {
        CharSequence charSequence = this.f8339d;
        return this.f8340e.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 0);
    }

    @Override // uk.c
    public final int K(int i10) {
        CharSequence charSequence = this.f8339d;
        return this.f8340e.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 2);
    }
}
