package wa;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import com.anonlab.voidlauncher.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r0 extends FrameLayout {
    public final Paint A;

    /* renamed from: a, reason: collision with root package name */
    public int f19148a;

    /* renamed from: b, reason: collision with root package name */
    public int f19149b;

    /* renamed from: c, reason: collision with root package name */
    public List f19150c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19151d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f19152e;

    /* renamed from: f, reason: collision with root package name */
    public final float f19153f;

    /* renamed from: z, reason: collision with root package name */
    public final float f19154z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Context context) {
        super(context, null, 0);
        fj.l.f(context, "context");
        this.f19148a = 1;
        this.f19149b = 1;
        this.f19150c = qi.s.f13520a;
        this.f19152e = new LinkedHashMap();
        float f10 = getResources().getDisplayMetrics().density;
        this.f19153f = f10;
        this.f19154z = 6.0f * f10;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setAlpha(210);
        paint.setStrokeWidth(f10 * 1.0f);
        this.A = paint;
        setWillNotDraw(true);
    }

    public final int getColumns() {
        return this.f19148a;
    }

    public final List<o0> getGridItems() {
        return this.f19150c;
    }

    public final int getRows() {
        return this.f19149b;
    }

    public final boolean getShowGridOutlines() {
        return this.f19151d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        fj.l.f(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f19151d) {
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            if (width <= 0 || height <= 0 || this.f19148a <= 0 || this.f19149b <= 0) {
                return;
            }
            List<o0> list = this.f19150c;
            ArrayList arrayList = new ArrayList();
            for (o0 o0Var : list) {
                ca.a aVar = o0Var.f19131b;
                int i10 = (int) aVar.f3141a;
                int i11 = (int) aVar.f3142b;
                ca.b bVar = o0Var.f19132c;
                int i12 = (int) bVar.f3143a;
                if (i12 < 1) {
                    i12 = 1;
                }
                int i13 = (int) bVar.f3144b;
                kj.h hVarT = cg.b.T(i11, (i13 >= 1 ? i13 : 1) + i11);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hVarT.iterator();
                while (true) {
                    kj.g gVar = (kj.g) it;
                    if (gVar.f9670c) {
                        int iNextInt = gVar.nextInt();
                        kj.h hVarT2 = cg.b.T(i10, i10 + i12);
                        ArrayList arrayList3 = new ArrayList(qi.m.s0(hVarT2));
                        Iterator it2 = hVarT2.iterator();
                        while (true) {
                            kj.g gVar2 = (kj.g) it2;
                            if (gVar2.f9670c) {
                                arrayList3.add(new pi.h(Integer.valueOf(gVar2.nextInt()), Integer.valueOf(iNextInt)));
                            }
                        }
                        qi.q.u0(arrayList2, arrayList3);
                    }
                }
                qi.q.u0(arrayList, arrayList2);
            }
            Set setV0 = qi.l.V0(arrayList);
            float f10 = width / this.f19148a;
            float f11 = height / this.f19149b;
            RectF rectF = new RectF();
            int i14 = this.f19149b;
            for (int i15 = 0; i15 < i14; i15++) {
                int i16 = this.f19148a;
                for (int i17 = 0; i17 < i16; i17++) {
                    if (!setV0.contains(new pi.h(Integer.valueOf(i17), Integer.valueOf(i15)))) {
                        float f12 = this.f19154z;
                        rectF.set((i17 * f10) + getPaddingLeft() + f12, (i15 * f11) + getPaddingTop() + f12, (((i17 + 1) * f10) + getPaddingLeft()) - f12, (((i15 + 1) * f11) + getPaddingTop()) - f12);
                        float f13 = this.f19153f * 12.0f;
                        canvas.drawRoundRect(rectF, f13, f13, this.A);
                    }
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        o0 o0Var;
        int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
        int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        if (paddingLeft <= 0 || paddingTop <= 0 || (i14 = this.f19148a) <= 0 || (i15 = this.f19149b) <= 0) {
            super.onLayout(z2, i10, i11, i12, i13);
            return;
        }
        int i16 = paddingLeft / i14;
        int i17 = paddingTop / i15;
        List list = this.f19150c;
        int iG0 = qi.v.g0(qi.m.s0(list));
        if (iG0 < 16) {
            iG0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG0);
        for (Object obj : list) {
            linkedHashMap.put(((o0) obj).f19130a.f19863b, obj);
        }
        int childCount = getChildCount();
        int i18 = 0;
        while (true) {
            LinkedHashMap linkedHashMap2 = this.f19152e;
            if (i18 >= childCount) {
                linkedHashMap2.keySet().retainAll(linkedHashMap.keySet());
                invalidate();
                return;
            }
            View childAt = getChildAt(i18);
            if (childAt != null) {
                Object tag = childAt.getTag(R.id.app_icon_image);
                String str = tag instanceof String ? (String) tag : null;
                if (str != null && (o0Var = (o0) linkedHashMap.get(str)) != null) {
                    ca.a aVar = o0Var.f19131b;
                    int i19 = (int) aVar.f3141a;
                    int i20 = (int) aVar.f3142b;
                    ca.b bVar = o0Var.f19132c;
                    int i21 = (int) bVar.f3143a;
                    if (i21 < 1) {
                        i21 = 1;
                    }
                    int i22 = (int) bVar.f3144b;
                    int i23 = i21 * i16;
                    int i24 = (i22 >= 1 ? i22 : 1) * i17;
                    int paddingLeft2 = (i19 * i16) + getPaddingLeft();
                    int paddingTop2 = (i20 * i17) + getPaddingTop();
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, 1073741824), View.MeasureSpec.makeMeasureSpec(i24, 1073741824));
                    pi.h hVar = (pi.h) linkedHashMap2.get(str);
                    childAt.layout(paddingLeft2, paddingTop2, i23 + paddingLeft2, i24 + paddingTop2);
                    linkedHashMap2.put(str, new pi.h(Integer.valueOf(paddingLeft2), Integer.valueOf(paddingTop2)));
                    if (hVar != null && !hVar.equals(new pi.h(Integer.valueOf(paddingLeft2), Integer.valueOf(paddingTop2)))) {
                        childAt.animate().cancel();
                        childAt.setTranslationX(((Number) hVar.f13000a).intValue() - paddingLeft2);
                        childAt.setTranslationY(((Number) hVar.f13001b).intValue() - paddingTop2);
                        childAt.animate().translationX(0.0f).translationY(0.0f).setDuration(150L).start();
                    }
                }
            }
            i18++;
        }
    }

    public final void setColumns(int i10) {
        this.f19148a = i10;
    }

    public final void setGridItems(List<o0> list) {
        fj.l.f(list, "<set-?>");
        this.f19150c = list;
    }

    public final void setRows(int i10) {
        this.f19149b = i10;
    }

    public final void setShowGridOutlines(boolean z2) {
        this.f19151d = z2;
        setWillNotDraw(!z2);
        invalidate();
    }
}
