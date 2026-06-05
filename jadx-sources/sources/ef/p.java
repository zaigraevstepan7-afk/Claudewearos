package ef;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class p extends v {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6041c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f6042d;

    public p(ArrayList arrayList, Matrix matrix) {
        this.f6041c = arrayList;
        this.f6042d = matrix;
    }

    @Override // ef.v
    public final void a(Matrix matrix, df.a aVar, int i10, Canvas canvas) {
        ArrayList arrayList = this.f6041c;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((v) obj).a(this.f6042d, aVar, i10, canvas);
        }
    }
}
