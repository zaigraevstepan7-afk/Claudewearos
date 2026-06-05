package r5;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a0 implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13722a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f13723b;

    public a0(Spannable spannable) {
        this.f13723b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f13723b;
        if (!this.f13722a) {
            if ((Build.VERSION.SDK_INT < 28 ? new p9.a(10) : new z(10)).h(spannable)) {
                this.f13723b = new SpannableString(spannable);
            }
        }
        this.f13722a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f13723b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f13723b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f13723b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f13723b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f13723b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f13723b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        return this.f13723b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f13723b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f13723b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f13723b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f13723b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f13723b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f13723b.toString();
    }
}
