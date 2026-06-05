package d4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f4948n;

    /* renamed from: a, reason: collision with root package name */
    public float f4949a;

    /* renamed from: b, reason: collision with root package name */
    public float f4950b;

    /* renamed from: c, reason: collision with root package name */
    public float f4951c;

    /* renamed from: d, reason: collision with root package name */
    public float f4952d;

    /* renamed from: e, reason: collision with root package name */
    public float f4953e;

    /* renamed from: f, reason: collision with root package name */
    public float f4954f;

    /* renamed from: g, reason: collision with root package name */
    public float f4955g;

    /* renamed from: h, reason: collision with root package name */
    public int f4956h;

    /* renamed from: i, reason: collision with root package name */
    public float f4957i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f4958k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4959l;

    /* renamed from: m, reason: collision with root package name */
    public float f4960m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4948n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f4975i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (f4948n.get(index)) {
                case 1:
                    this.f4949a = typedArrayObtainStyledAttributes.getFloat(index, this.f4949a);
                    break;
                case 2:
                    this.f4950b = typedArrayObtainStyledAttributes.getFloat(index, this.f4950b);
                    break;
                case 3:
                    this.f4951c = typedArrayObtainStyledAttributes.getFloat(index, this.f4951c);
                    break;
                case 4:
                    this.f4952d = typedArrayObtainStyledAttributes.getFloat(index, this.f4952d);
                    break;
                case 5:
                    this.f4953e = typedArrayObtainStyledAttributes.getFloat(index, this.f4953e);
                    break;
                case 6:
                    this.f4954f = typedArrayObtainStyledAttributes.getDimension(index, this.f4954f);
                    break;
                case 7:
                    this.f4955g = typedArrayObtainStyledAttributes.getDimension(index, this.f4955g);
                    break;
                case 8:
                    this.f4957i = typedArrayObtainStyledAttributes.getDimension(index, this.f4957i);
                    break;
                case 9:
                    this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 10:
                    this.f4958k = typedArrayObtainStyledAttributes.getDimension(index, this.f4958k);
                    break;
                case 11:
                    this.f4959l = true;
                    this.f4960m = typedArrayObtainStyledAttributes.getDimension(index, this.f4960m);
                    break;
                case 12:
                    this.f4956h = o.f(typedArrayObtainStyledAttributes, index, this.f4956h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
