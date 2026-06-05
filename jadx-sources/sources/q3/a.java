package q3;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import e2.e;
import e2.g;
import e2.h;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final e f13196a;

    public a(e eVar) {
        this.f13196a = eVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            g gVar = g.f5743a;
            e eVar = this.f13196a;
            if (l.b(eVar, gVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(eVar instanceof h)) {
                throw new b3.e();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            h hVar = (h) eVar;
            textPaint.setStrokeWidth(hVar.f5744a);
            textPaint.setStrokeMiter(hVar.f5745b);
            int i10 = hVar.f5747d;
            textPaint.setStrokeJoin(i10 == 0 ? Paint.Join.MITER : i10 == 1 ? Paint.Join.ROUND : i10 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i11 = hVar.f5746c;
            textPaint.setStrokeCap(i11 == 0 ? Paint.Cap.BUTT : i11 == 1 ? Paint.Cap.ROUND : i11 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
