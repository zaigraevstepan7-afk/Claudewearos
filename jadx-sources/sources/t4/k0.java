package t4;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.anonlab.voidlauncher.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f15740d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f15741a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f15742b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f15743c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f15741a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewA = a(viewGroup.getChildAt(childCount));
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
