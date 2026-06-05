package ze;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f20537a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f20538b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20539c;

    /* renamed from: d, reason: collision with root package name */
    public int f20540d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20546k;

    /* renamed from: m, reason: collision with root package name */
    public ac.h f20548m;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f20541e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f20542f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: g, reason: collision with root package name */
    public float f20543g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f20544h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f20545i = 1;
    public boolean j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f20547l = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f20537a = charSequence;
        this.f20538b = textPaint;
        this.f20539c = i10;
        this.f20540d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f20537a == null) {
            this.f20537a = "";
        }
        int iMax = Math.max(0, this.f20539c);
        CharSequence charSequenceEllipsize = this.f20537a;
        int i10 = this.f20542f;
        TextPaint textPaint = this.f20538b;
        if (i10 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f20547l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f20540d);
        this.f20540d = iMin;
        if (this.f20546k && this.f20542f == 1) {
            this.f20541e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f20541e);
        builderObtain.setIncludePad(this.j);
        builderObtain.setTextDirection(this.f20546k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f20547l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f20542f);
        float f10 = this.f20543g;
        if (f10 != 0.0f || this.f20544h != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f20544h);
        }
        if (this.f20542f > 1) {
            builderObtain.setHyphenationFrequency(this.f20545i);
        }
        ac.h hVar = this.f20548m;
        if (hVar != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) hVar.f388b).N.getBreakStrategy());
        }
        return builderObtain.build();
    }
}
