package m;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public int f11112a = 0;

    /* renamed from: b, reason: collision with root package name */
    public float f11113b = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f11114c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f11115d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int[] f11116e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public boolean f11117f = false;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f11118g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f11119h;

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public k0(TextView textView) {
        this.f11118g = textView;
        this.f11119h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            new i0();
        } else {
            new h0();
        }
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final boolean b() {
        return !(this.f11118g instanceof r);
    }
}
