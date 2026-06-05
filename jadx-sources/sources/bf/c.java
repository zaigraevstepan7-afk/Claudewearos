package bf;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c extends x8.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextPaint f1755c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x8.a f1756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f1757e;

    public c(d dVar, Context context, TextPaint textPaint, x8.a aVar) {
        this.f1757e = dVar;
        this.f1754b = context;
        this.f1755c = textPaint;
        this.f1756d = aVar;
    }

    @Override // x8.a
    public final void R(int i10) {
        this.f1756d.R(i10);
    }

    @Override // x8.a
    public final void S(Typeface typeface, boolean z2) {
        this.f1757e.f(this.f1754b, this.f1755c, typeface);
        this.f1756d.S(typeface, z2);
    }
}
