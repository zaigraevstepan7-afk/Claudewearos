package w4;

import ac.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anonlab.voidlauncher.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f18574c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18575a;

    /* renamed from: b, reason: collision with root package name */
    public c f18576b;

    public d(Context context, List list) {
        super(context);
        this.f18575a = new ArrayList();
        setProtections(list);
    }

    private g getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof g) {
            return (g) tag;
        }
        g gVar = new g(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, gVar);
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0 A[LOOP:0: B:6:0x0023->B:26:0x00b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r13 = this;
            java.util.ArrayList r0 = r13.f18575a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto La
            goto Lc1
        La:
            w4.g r1 = r13.getOrInstallSystemBarStateMonitor()
            w4.c r2 = new w4.c
            r2.<init>(r1, r0)
            r13.f18576b = r2
            int r0 = r13.getChildCount()
            w4.c r1 = r13.f18576b
            java.util.ArrayList r1 = r1.f18568a
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        L23:
            if (r3 >= r1) goto Lc1
            w4.c r4 = r13.f18576b
            java.util.ArrayList r4 = r4.f18568a
            java.lang.Object r4 = r4.get(r3)
            w4.a r4 = (w4.a) r4
            android.content.Context r5 = r13.getContext()
            int r6 = r3 + r0
            w4.b r7 = r4.f18552b
            int r4 = r4.f18551a
            r8 = 1
            r9 = 4
            r10 = -1
            if (r4 == r8) goto L64
            r8 = 2
            if (r4 == r8) goto L5f
            if (r4 == r9) goto L58
            r8 = 8
            if (r4 != r8) goto L4c
            int r4 = r7.f18560b
            r8 = 80
            goto L68
        L4c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unexpected side: "
            java.lang.String r1 = m6.a.d(r4, r1)
            r0.<init>(r1)
            throw r0
        L58:
            int r4 = r7.f18559a
            r8 = 5
        L5b:
            r12 = r10
            r10 = r4
            r4 = r12
            goto L68
        L5f:
            int r4 = r7.f18560b
            r8 = 48
            goto L68
        L64:
            int r4 = r7.f18559a
            r8 = 3
            goto L5b
        L68:
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r11.<init>(r10, r4, r8)
            l4.b r4 = r7.f18561c
            int r8 = r4.f9967a
            r11.leftMargin = r8
            int r8 = r4.f9968b
            r11.topMargin = r8
            int r8 = r4.f9969c
            r11.rightMargin = r8
            int r4 = r4.f9970d
            r11.bottomMargin = r4
            android.view.View r4 = new android.view.View
            r4.<init>(r5)
            java.lang.Object r5 = w4.d.f18574c
            r4.setTag(r5)
            float r5 = r7.f18564f
            r4.setTranslationX(r5)
            float r5 = r7.f18565g
            r4.setTranslationY(r5)
            float r5 = r7.f18566h
            r4.setAlpha(r5)
            boolean r5 = r7.f18562d
            if (r5 == 0) goto L9d
            r9 = r2
        L9d:
            r4.setVisibility(r9)
            android.graphics.drawable.ColorDrawable r5 = r7.f18563e
            r4.setBackground(r5)
            qh.c r5 = new qh.c
            r8 = 14
            r5.<init>(r8, r11, r4)
            qh.c r8 = r7.f18567i
            if (r8 != 0) goto Lb9
            r7.f18567i = r5
            r13.addView(r4, r6, r11)
            int r3 = r3 + 1
            goto L23
        Lb9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?"
            r0.<init>(r1)
            throw r0
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.d.a():void");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f18574c) {
            c cVar = this.f18576b;
            int childCount = getChildCount() - (cVar != null ? cVar.f18568a.size() : 0);
            if (i10 > childCount || i10 < 0) {
                i10 = childCount;
            }
        }
        super.addView(view, i10, layoutParams);
    }

    public final void b() {
        if (this.f18576b != null) {
            removeViews(getChildCount() - this.f18576b.f18568a.size(), this.f18576b.f18568a.size());
            int size = this.f18576b.f18568a.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((a) this.f18576b.f18568a.get(i10)).f18552b.f18567i = null;
            }
            c cVar = this.f18576b;
            ArrayList arrayList = cVar.f18568a;
            if (!cVar.f18573f) {
                cVar.f18573f = true;
                cVar.f18569b.f18582b.remove(cVar);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((a) arrayList.get(size2)).f18555e = null;
                }
                arrayList.clear();
            }
            this.f18576b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18576b != null) {
            b();
        }
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof g) {
            g gVar = (g) tag;
            if (gVar.f18582b.isEmpty()) {
                gVar.f18581a.post(new o(gVar, 23));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<a> list) {
        ArrayList arrayList = this.f18575a;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            b();
            a();
            requestApplyInsets();
        }
    }
}
