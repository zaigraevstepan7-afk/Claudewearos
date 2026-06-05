package d4;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q extends View {
    public q(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i10) {
        e eVar = (e) getLayoutParams();
        eVar.f4822a = i10;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i10) {
        e eVar = (e) getLayoutParams();
        eVar.f4824b = i10;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f10) {
        e eVar = (e) getLayoutParams();
        eVar.f4826c = f10;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
