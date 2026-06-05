package ze;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public float f20551c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f20553e;

    /* renamed from: f, reason: collision with root package name */
    public bf.d f20554f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f20549a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final ue.b f20550b = new ue.b(this, 1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f20552d = true;

    public i(ue.f fVar) {
        this.f20553e = new WeakReference(null);
        this.f20553e = new WeakReference(fVar);
    }

    public final float a(String str) {
        if (!this.f20552d) {
            return this.f20551c;
        }
        TextPaint textPaint = this.f20549a;
        this.f20551c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f20552d = false;
        return this.f20551c;
    }
}
