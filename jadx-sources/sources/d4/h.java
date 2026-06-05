package d4;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f4873a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4874b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4875c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4876d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4877e;

    public h(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f4873a = Float.NaN;
        this.f4874b = Float.NaN;
        this.f4875c = Float.NaN;
        this.f4876d = Float.NaN;
        this.f4877e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f4877e);
                this.f4877e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f4876d = typedArrayObtainStyledAttributes.getDimension(index, this.f4876d);
            } else if (index == 2) {
                this.f4874b = typedArrayObtainStyledAttributes.getDimension(index, this.f4874b);
            } else if (index == 3) {
                this.f4875c = typedArrayObtainStyledAttributes.getDimension(index, this.f4875c);
            } else if (index == 4) {
                this.f4873a = typedArrayObtainStyledAttributes.getDimension(index, this.f4873a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
