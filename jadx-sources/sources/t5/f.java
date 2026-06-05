package t5;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends a.a {

    /* renamed from: c, reason: collision with root package name */
    public final TextView f15810c;

    /* renamed from: d, reason: collision with root package name */
    public final d f15811d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15812e = true;

    public f(TextView textView) {
        this.f15810c = textView;
        this.f15811d = new d(textView);
    }

    @Override // a.a
    public final InputFilter[] C(InputFilter[] inputFilterArr) {
        if (!this.f15812e) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (sparseArray.indexOfKey(i12) < 0) {
                    inputFilterArr2[i11] = inputFilterArr[i12];
                    i11++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i13 = 0;
        while (true) {
            d dVar = this.f15811d;
            if (i13 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i13] == dVar) {
                return inputFilterArr;
            }
            i13++;
        }
    }

    @Override // a.a
    public final void V(boolean z2) {
        if (z2) {
            f0();
        }
    }

    @Override // a.a
    public final void W(boolean z2) {
        this.f15812e = z2;
        f0();
        TextView textView = this.f15810c;
        textView.setFilters(C(textView.getFilters()));
    }

    public final void f0() {
        TextView textView = this.f15810c;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f15812e) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f15818a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
