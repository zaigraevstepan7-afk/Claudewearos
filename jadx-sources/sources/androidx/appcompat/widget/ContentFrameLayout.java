package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import m.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f802a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f803b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f804c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f805d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f806e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f807f;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f808z;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f808z = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f806e == null) {
            this.f806e = new TypedValue();
        }
        return this.f806e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f807f == null) {
            this.f807f = new TypedValue();
        }
        return this.f807f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f804c == null) {
            this.f804c = new TypedValue();
        }
        return this.f804c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f805d == null) {
            this.f805d = new TypedValue();
        }
        return this.f805d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f802a == null) {
            this.f802a = new TypedValue();
        }
        return this.f802a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f803b == null) {
            this.f803b = new TypedValue();
        }
        return this.f803b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(l0 l0Var) {
    }
}
