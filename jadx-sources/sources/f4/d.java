package f4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public a f6623a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6624b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6625c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6626d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6627e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6628f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6629g;

    /* renamed from: h, reason: collision with root package name */
    public int f6630h;

    /* renamed from: i, reason: collision with root package name */
    public int f6631i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public View f6632k;

    /* renamed from: l, reason: collision with root package name */
    public View f6633l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6634m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6635n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f6636o;

    public d() {
        super(-2, -2);
        this.f6624b = false;
        this.f6625c = 0;
        this.f6626d = 0;
        this.f6627e = -1;
        this.f6628f = -1;
        this.f6629g = 0;
        this.f6630h = 0;
        this.f6636o = new Rect();
    }

    public final boolean a(int i10) {
        if (i10 == 0) {
            return this.f6634m;
        }
        if (i10 != 1) {
            return false;
        }
        return this.f6635n;
    }

    public d(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        a aVar;
        super(context, attributeSet);
        this.f6624b = false;
        this.f6625c = 0;
        this.f6626d = 0;
        this.f6627e = -1;
        this.f6628f = -1;
        this.f6629g = 0;
        this.f6630h = 0;
        this.f6636o = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e4.a.f5784b);
        this.f6625c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f6628f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f6626d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f6627e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f6629g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f6630h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f6624b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.M;
            if (TextUtils.isEmpty(string)) {
                aVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.M;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.O;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.N);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (a) constructor.newInstance(context, attributeSet);
                } catch (Exception e10) {
                    throw new RuntimeException(m1.i("Could not inflate Behavior subclass ", string), e10);
                }
            }
            this.f6623a = aVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        a aVar2 = this.f6623a;
        if (aVar2 != null) {
            aVar2.c(this);
        }
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f6624b = false;
        this.f6625c = 0;
        this.f6626d = 0;
        this.f6627e = -1;
        this.f6628f = -1;
        this.f6629g = 0;
        this.f6630h = 0;
        this.f6636o = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f6624b = false;
        this.f6625c = 0;
        this.f6626d = 0;
        this.f6627e = -1;
        this.f6628f = -1;
        this.f6629g = 0;
        this.f6630h = 0;
        this.f6636o = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f6624b = false;
        this.f6625c = 0;
        this.f6626d = 0;
        this.f6627e = -1;
        this.f6628f = -1;
        this.f6629g = 0;
        this.f6630h = 0;
        this.f6636o = new Rect();
    }
}
