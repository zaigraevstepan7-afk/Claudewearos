package androidx.constraintlayout.widget;

import a4.d;
import a4.e;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbch;
import d4.c;
import d4.f;
import d4.h;
import d4.o;
import d4.p;
import d4.q;
import d4.s;
import d4.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import mh.g;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static t K;
    public boolean A;
    public int B;
    public o C;
    public g D;
    public int E;
    public HashMap F;
    public final SparseArray G;
    public final f H;
    public int I;
    public int J;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f843a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f844b;

    /* renamed from: c, reason: collision with root package name */
    public final e f845c;

    /* renamed from: d, reason: collision with root package name */
    public int f846d;

    /* renamed from: e, reason: collision with root package name */
    public int f847e;

    /* renamed from: f, reason: collision with root package name */
    public int f848f;

    /* renamed from: z, reason: collision with root package name */
    public int f849z;

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        super(context, attributeSet);
        this.f843a = new SparseArray();
        this.f844b = new ArrayList(4);
        this.f845c = new e();
        this.f846d = 0;
        this.f847e = 0;
        this.f848f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f849z = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.A = true;
        this.B = 257;
        this.C = null;
        this.D = null;
        this.E = -1;
        this.F = new HashMap();
        this.G = new SparseArray();
        this.H = new f(this, this);
        this.I = 0;
        this.J = 0;
        i(attributeSet, 0);
    }

    public static d4.e a() {
        d4.e eVar = new d4.e(-2, -2);
        eVar.f4822a = -1;
        eVar.f4824b = -1;
        eVar.f4826c = -1.0f;
        eVar.f4828d = -1;
        eVar.f4830e = -1;
        eVar.f4832f = -1;
        eVar.f4834g = -1;
        eVar.f4836h = -1;
        eVar.f4838i = -1;
        eVar.j = -1;
        eVar.f4841k = -1;
        eVar.f4843l = -1;
        eVar.f4845m = -1;
        eVar.f4847n = -1;
        eVar.f4849o = -1;
        eVar.f4851p = 0;
        eVar.f4852q = 0.0f;
        eVar.f4853r = -1;
        eVar.f4854s = -1;
        eVar.f4855t = -1;
        eVar.f4856u = -1;
        eVar.f4857v = Integer.MIN_VALUE;
        eVar.f4858w = Integer.MIN_VALUE;
        eVar.f4859x = Integer.MIN_VALUE;
        eVar.f4860y = Integer.MIN_VALUE;
        eVar.f4861z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = 0;
        eVar.D = 0.5f;
        eVar.E = 0.5f;
        eVar.F = null;
        eVar.G = -1.0f;
        eVar.H = -1.0f;
        eVar.I = 0;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 1.0f;
        eVar.R = 1.0f;
        eVar.S = -1;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = false;
        eVar.W = false;
        eVar.X = null;
        eVar.Y = 0;
        eVar.Z = true;
        eVar.f4823a0 = true;
        eVar.f4825b0 = false;
        eVar.f4827c0 = false;
        eVar.f4829d0 = false;
        eVar.f4831e0 = -1;
        eVar.f4833f0 = -1;
        eVar.f4835g0 = -1;
        eVar.f4837h0 = -1;
        eVar.f4839i0 = Integer.MIN_VALUE;
        eVar.f4840j0 = Integer.MIN_VALUE;
        eVar.f4842k0 = 0.5f;
        eVar.f4850o0 = new d();
        return eVar;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static t getSharedValues() {
        if (K == null) {
            t tVar = new t();
            new SparseIntArray();
            new HashMap();
            K = tVar;
        }
        return K;
    }

    public final d b(View view) {
        if (view == this) {
            return this.f845c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof d4.e) {
            return ((d4.e) view.getLayoutParams()).f4850o0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof d4.e) {
            return ((d4.e) view.getLayoutParams()).f4850o0;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d4.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.f844b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((c) arrayList.get(i10)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.A = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d4.e eVar = new d4.e(context, attributeSet);
        eVar.f4822a = -1;
        eVar.f4824b = -1;
        eVar.f4826c = -1.0f;
        eVar.f4828d = -1;
        eVar.f4830e = -1;
        eVar.f4832f = -1;
        eVar.f4834g = -1;
        eVar.f4836h = -1;
        eVar.f4838i = -1;
        eVar.j = -1;
        eVar.f4841k = -1;
        eVar.f4843l = -1;
        eVar.f4845m = -1;
        eVar.f4847n = -1;
        eVar.f4849o = -1;
        eVar.f4851p = 0;
        eVar.f4852q = 0.0f;
        eVar.f4853r = -1;
        eVar.f4854s = -1;
        eVar.f4855t = -1;
        eVar.f4856u = -1;
        eVar.f4857v = Integer.MIN_VALUE;
        eVar.f4858w = Integer.MIN_VALUE;
        eVar.f4859x = Integer.MIN_VALUE;
        eVar.f4860y = Integer.MIN_VALUE;
        eVar.f4861z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = 0;
        eVar.D = 0.5f;
        eVar.E = 0.5f;
        eVar.F = null;
        eVar.G = -1.0f;
        eVar.H = -1.0f;
        eVar.I = 0;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 1.0f;
        eVar.R = 1.0f;
        eVar.S = -1;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = false;
        eVar.W = false;
        eVar.X = null;
        eVar.Y = 0;
        eVar.Z = true;
        eVar.f4823a0 = true;
        eVar.f4825b0 = false;
        eVar.f4827c0 = false;
        eVar.f4829d0 = false;
        eVar.f4831e0 = -1;
        eVar.f4833f0 = -1;
        eVar.f4835g0 = -1;
        eVar.f4837h0 = -1;
        eVar.f4839i0 = Integer.MIN_VALUE;
        eVar.f4840j0 = Integer.MIN_VALUE;
        eVar.f4842k0 = 0.5f;
        eVar.f4850o0 = new d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f4968b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            int i11 = d4.d.f4821a.get(index);
            switch (i11) {
                case 1:
                    eVar.U = typedArrayObtainStyledAttributes.getInt(index, eVar.U);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4849o);
                    eVar.f4849o = resourceId;
                    if (resourceId == -1) {
                        eVar.f4849o = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    eVar.f4851p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f4851p);
                    break;
                case 4:
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, eVar.f4852q) % 360.0f;
                    eVar.f4852q = f10;
                    if (f10 < 0.0f) {
                        eVar.f4852q = (360.0f - f10) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    eVar.f4822a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f4822a);
                    break;
                case 6:
                    eVar.f4824b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f4824b);
                    break;
                case 7:
                    eVar.f4826c = typedArrayObtainStyledAttributes.getFloat(index, eVar.f4826c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4828d);
                    eVar.f4828d = resourceId2;
                    if (resourceId2 == -1) {
                        eVar.f4828d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4830e);
                    eVar.f4830e = resourceId3;
                    if (resourceId3 == -1) {
                        eVar.f4830e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4832f);
                    eVar.f4832f = resourceId4;
                    if (resourceId4 == -1) {
                        eVar.f4832f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4834g);
                    eVar.f4834g = resourceId5;
                    if (resourceId5 == -1) {
                        eVar.f4834g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4836h);
                    eVar.f4836h = resourceId6;
                    if (resourceId6 == -1) {
                        eVar.f4836h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4838i);
                    eVar.f4838i = resourceId7;
                    if (resourceId7 == -1) {
                        eVar.f4838i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.j);
                    eVar.j = resourceId8;
                    if (resourceId8 == -1) {
                        eVar.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4841k);
                    eVar.f4841k = resourceId9;
                    if (resourceId9 == -1) {
                        eVar.f4841k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4843l);
                    eVar.f4843l = resourceId10;
                    if (resourceId10 == -1) {
                        eVar.f4843l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4853r);
                    eVar.f4853r = resourceId11;
                    if (resourceId11 == -1) {
                        eVar.f4853r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4854s);
                    eVar.f4854s = resourceId12;
                    if (resourceId12 == -1) {
                        eVar.f4854s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4855t);
                    eVar.f4855t = resourceId13;
                    if (resourceId13 == -1) {
                        eVar.f4855t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4856u);
                    eVar.f4856u = resourceId14;
                    if (resourceId14 == -1) {
                        eVar.f4856u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case zzbch.zzt.zzm /* 21 */:
                    eVar.f4857v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f4857v);
                    break;
                case 22:
                    eVar.f4858w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f4858w);
                    break;
                case 23:
                    eVar.f4859x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f4859x);
                    break;
                case 24:
                    eVar.f4860y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f4860y);
                    break;
                case 25:
                    eVar.f4861z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f4861z);
                    break;
                case 26:
                    eVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.A);
                    break;
                case 27:
                    eVar.V = typedArrayObtainStyledAttributes.getBoolean(index, eVar.V);
                    break;
                case 28:
                    eVar.W = typedArrayObtainStyledAttributes.getBoolean(index, eVar.W);
                    break;
                case 29:
                    eVar.D = typedArrayObtainStyledAttributes.getFloat(index, eVar.D);
                    break;
                case 30:
                    eVar.E = typedArrayObtainStyledAttributes.getFloat(index, eVar.E);
                    break;
                case 31:
                    int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    eVar.K = i12;
                    if (i12 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    eVar.L = i13;
                    if (i13 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        eVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.M);
                        break;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.M) == -2) {
                            eVar.M = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        eVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.O);
                        break;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.O) == -2) {
                            eVar.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    eVar.Q = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.Q));
                    eVar.K = 2;
                    break;
                case 36:
                    try {
                        eVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.N);
                        break;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.N) == -2) {
                            eVar.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        eVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.P);
                        break;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.P) == -2) {
                            eVar.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    eVar.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.R));
                    eVar.L = 2;
                    break;
                default:
                    switch (i11) {
                        case 44:
                            o.h(eVar, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            eVar.G = typedArrayObtainStyledAttributes.getFloat(index, eVar.G);
                            break;
                        case 46:
                            eVar.H = typedArrayObtainStyledAttributes.getFloat(index, eVar.H);
                            break;
                        case 47:
                            eVar.I = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            eVar.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            eVar.S = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.S);
                            break;
                        case 50:
                            eVar.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.T);
                            break;
                        case 51:
                            eVar.X = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4845m);
                            eVar.f4845m = resourceId15;
                            if (resourceId15 == -1) {
                                eVar.f4845m = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4847n);
                            eVar.f4847n = resourceId16;
                            if (resourceId16 == -1) {
                                eVar.f4847n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            eVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.C);
                            break;
                        case 55:
                            eVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.B);
                            break;
                        default:
                            switch (i11) {
                                case 64:
                                    o.g(eVar, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    o.g(eVar, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    eVar.Y = typedArrayObtainStyledAttributes.getInt(index, eVar.Y);
                                    break;
                            }
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        eVar.a();
        return eVar;
    }

    public int getMaxHeight() {
        return this.f849z;
    }

    public int getMaxWidth() {
        return this.f848f;
    }

    public int getMinHeight() {
        return this.f847e;
    }

    public int getMinWidth() {
        return this.f846d;
    }

    public int getOptimizationLevel() {
        return this.f845c.C0;
    }

    public final void i(AttributeSet attributeSet, int i10) throws XmlPullParserException, IOException {
        e eVar = this.f845c;
        eVar.f110e0 = this;
        f fVar = this.H;
        eVar.f145t0 = fVar;
        eVar.f143r0.f1539h = fVar;
        this.f843a.put(getId(), this);
        this.C = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f4968b, i10, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 16) {
                    this.f846d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f846d);
                } else if (index == 17) {
                    this.f847e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f847e);
                } else if (index == 14) {
                    this.f848f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f848f);
                } else if (index == 15) {
                    this.f849z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f849z);
                } else if (index == 112) {
                    this.B = typedArrayObtainStyledAttributes.getInt(index, this.B);
                } else if (index == 55) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.D = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        o oVar = new o();
                        this.C = oVar;
                        oVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.C = null;
                    }
                    this.E = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        eVar.C0 = this.B;
        y3.c.f20175p = eVar.R(512);
    }

    public final void j(int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        String str;
        Context context = getContext();
        g gVar = new g(9, false);
        gVar.f11707b = new SparseArray();
        gVar.f11708c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            d4.g gVar2 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                gVar.y(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                gVar2 = new d4.g(context, xml);
                                ((SparseArray) gVar.f11707b).put(gVar2.f4870a, gVar2);
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                h hVar = new h(context, xml);
                                if (gVar2 != null) {
                                    ((ArrayList) gVar2.f4872c).add(hVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
        this.D = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(a4.e r29, int r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 1772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(a4.e, int, int, int):void");
    }

    public final void l(d dVar, d4.e eVar, SparseArray sparseArray, int i10, int i11) {
        View view = (View) this.f843a.get(i10);
        d dVar2 = (d) sparseArray.get(i10);
        if (dVar2 == null || view == null || !(view.getLayoutParams() instanceof d4.e)) {
            return;
        }
        eVar.f4825b0 = true;
        if (i11 == 6) {
            d4.e eVar2 = (d4.e) view.getLayoutParams();
            eVar2.f4825b0 = true;
            eVar2.f4850o0.D = true;
        }
        dVar.i(6).b(dVar2.i(i11), eVar.C, eVar.B, true);
        dVar.D = true;
        dVar.i(3).j();
        dVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            d4.e eVar = (d4.e) childAt.getLayoutParams();
            d dVar = eVar.f4850o0;
            if (childAt.getVisibility() != 8 || eVar.f4827c0 || eVar.f4829d0 || zIsInEditMode) {
                int iO = dVar.o();
                int iP = dVar.p();
                childAt.layout(iO, iP, dVar.n() + iO, dVar.k() + iP);
            }
        }
        ArrayList arrayList = this.f844b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((c) arrayList.get(i15)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x055a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r35, int r36) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d dVarB = b(view);
        if ((view instanceof q) && !(dVarB instanceof a4.h)) {
            d4.e eVar = (d4.e) view.getLayoutParams();
            a4.h hVar = new a4.h();
            eVar.f4850o0 = hVar;
            eVar.f4827c0 = true;
            hVar.N(eVar.U);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((d4.e) view.getLayoutParams()).f4829d0 = true;
            ArrayList arrayList = this.f844b;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f843a.put(view.getId(), view);
        this.A = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f843a.remove(view.getId());
        d dVarB = b(view);
        this.f845c.f141p0.remove(dVarB);
        dVarB.z();
        this.f844b.remove(view);
        this.A = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.A = true;
        super.requestLayout();
    }

    public void setConstraintSet(o oVar) {
        this.C = oVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        int id2 = getId();
        SparseArray sparseArray = this.f843a;
        sparseArray.remove(id2);
        super.setId(i10);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f849z) {
            return;
        }
        this.f849z = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f848f) {
            return;
        }
        this.f848f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f847e) {
            return;
        }
        this.f847e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f846d) {
            return;
        }
        this.f846d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(p pVar) {
        g gVar = this.D;
        if (gVar != null) {
            gVar.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        this.B = i10;
        e eVar = this.f845c;
        eVar.C0 = i10;
        y3.c.f20175p = eVar.R(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) throws XmlPullParserException, IOException {
        super(context, attributeSet, i10);
        this.f843a = new SparseArray();
        this.f844b = new ArrayList(4);
        this.f845c = new e();
        this.f846d = 0;
        this.f847e = 0;
        this.f848f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f849z = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.A = true;
        this.B = 257;
        this.C = null;
        this.D = null;
        this.E = -1;
        this.F = new HashMap();
        this.G = new SparseArray();
        this.H = new f(this, this);
        this.I = 0;
        this.J = 0;
        i(attributeSet, i10);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        d4.e eVar = new d4.e(layoutParams);
        eVar.f4822a = -1;
        eVar.f4824b = -1;
        eVar.f4826c = -1.0f;
        eVar.f4828d = -1;
        eVar.f4830e = -1;
        eVar.f4832f = -1;
        eVar.f4834g = -1;
        eVar.f4836h = -1;
        eVar.f4838i = -1;
        eVar.j = -1;
        eVar.f4841k = -1;
        eVar.f4843l = -1;
        eVar.f4845m = -1;
        eVar.f4847n = -1;
        eVar.f4849o = -1;
        eVar.f4851p = 0;
        eVar.f4852q = 0.0f;
        eVar.f4853r = -1;
        eVar.f4854s = -1;
        eVar.f4855t = -1;
        eVar.f4856u = -1;
        eVar.f4857v = Integer.MIN_VALUE;
        eVar.f4858w = Integer.MIN_VALUE;
        eVar.f4859x = Integer.MIN_VALUE;
        eVar.f4860y = Integer.MIN_VALUE;
        eVar.f4861z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = 0;
        eVar.D = 0.5f;
        eVar.E = 0.5f;
        eVar.F = null;
        eVar.G = -1.0f;
        eVar.H = -1.0f;
        eVar.I = 0;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 1.0f;
        eVar.R = 1.0f;
        eVar.S = -1;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = false;
        eVar.W = false;
        eVar.X = null;
        eVar.Y = 0;
        eVar.Z = true;
        eVar.f4823a0 = true;
        eVar.f4825b0 = false;
        eVar.f4827c0 = false;
        eVar.f4829d0 = false;
        eVar.f4831e0 = -1;
        eVar.f4833f0 = -1;
        eVar.f4835g0 = -1;
        eVar.f4837h0 = -1;
        eVar.f4839i0 = Integer.MIN_VALUE;
        eVar.f4840j0 = Integer.MIN_VALUE;
        eVar.f4842k0 = 0.5f;
        eVar.f4850o0 = new d();
        return eVar;
    }
}
