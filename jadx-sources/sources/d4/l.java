package d4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l {
    public static final SparseIntArray j;

    /* renamed from: a, reason: collision with root package name */
    public int f4935a;

    /* renamed from: b, reason: collision with root package name */
    public int f4936b;

    /* renamed from: c, reason: collision with root package name */
    public int f4937c;

    /* renamed from: d, reason: collision with root package name */
    public float f4938d;

    /* renamed from: e, reason: collision with root package name */
    public float f4939e;

    /* renamed from: f, reason: collision with root package name */
    public float f4940f;

    /* renamed from: g, reason: collision with root package name */
    public int f4941g;

    /* renamed from: h, reason: collision with root package name */
    public String f4942h;

    /* renamed from: i, reason: collision with root package name */
    public int f4943i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f4972f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (j.get(index)) {
                case 1:
                    this.f4939e = typedArrayObtainStyledAttributes.getFloat(index, this.f4939e);
                    break;
                case 2:
                    this.f4937c = typedArrayObtainStyledAttributes.getInt(index, this.f4937c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = z3.a.f20372a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f4935a = o.f(typedArrayObtainStyledAttributes, index, this.f4935a);
                    break;
                case 6:
                    this.f4936b = typedArrayObtainStyledAttributes.getInteger(index, this.f4936b);
                    break;
                case 7:
                    this.f4938d = typedArrayObtainStyledAttributes.getFloat(index, this.f4938d);
                    break;
                case 8:
                    this.f4941g = typedArrayObtainStyledAttributes.getInteger(index, this.f4941g);
                    break;
                case 9:
                    this.f4940f = typedArrayObtainStyledAttributes.getFloat(index, this.f4940f);
                    break;
                case 10:
                    int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i11 == 1) {
                        this.f4943i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i11 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f4942h = string;
                        if (string.indexOf("/") > 0) {
                            this.f4943i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f4943i);
                        break;
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
