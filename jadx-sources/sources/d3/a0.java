package d3;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4706b;

    public /* synthetic */ a0(Object obj, int i10) {
        this.f4705a = i10;
        this.f4706b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4705a) {
            case 0:
                return ((Number) ((ej.e) this.f4706b).invoke(obj, obj2)).intValue();
            case 1:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f4706b;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.H).compareTo(Boolean.valueOf(materialButton2.H));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
            default:
                for (ej.c cVar : (ej.c[]) this.f4706b) {
                    int iL = mk.b.l((Comparable) cVar.invoke(obj), (Comparable) cVar.invoke(obj2));
                    if (iL != 0) {
                        return iL;
                    }
                }
                return 0;
        }
    }
}
