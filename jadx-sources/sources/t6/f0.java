package t6;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class f0 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public t0 f15893a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f15894b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15895c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15896d;

    public f0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15894b = new Rect();
        this.f15895c = true;
        this.f15896d = false;
    }

    public f0(int i10, int i11) {
        super(i10, i11);
        this.f15894b = new Rect();
        this.f15895c = true;
        this.f15896d = false;
    }

    public f0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f15894b = new Rect();
        this.f15895c = true;
        this.f15896d = false;
    }

    public f0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f15894b = new Rect();
        this.f15895c = true;
        this.f15896d = false;
    }

    public f0(f0 f0Var) {
        super((ViewGroup.LayoutParams) f0Var);
        this.f15894b = new Rect();
        this.f15895c = true;
        this.f15896d = false;
    }
}
