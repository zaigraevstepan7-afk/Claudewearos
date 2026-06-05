package te;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.anonlab.voidlauncher.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import t6.c0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f16320a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16321b;

    public b() {
        Paint paint = new Paint();
        this.f16320a = paint;
        this.f16321b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // t6.c0
    public final void b(Canvas canvas, RecyclerView recyclerView) throws Resources.NotFoundException {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f16320a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f16321b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getClass();
            ThreadLocal threadLocal = l4.a.f9965a;
            float f10 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f10)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f10)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f10)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f10))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).C0()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3833q.f(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3833q.b(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f3833q.c(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3833q.d(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
