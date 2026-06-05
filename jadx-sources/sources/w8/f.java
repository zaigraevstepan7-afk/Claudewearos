package w8;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f18947a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18948b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18949c;

    public f(JSONObject jSONObject) throws JSONException {
        this.f18947a = jSONObject.optString("basePlanId");
        String strOptString = jSONObject.optString("offerId");
        this.f18948b = true == strOptString.isEmpty() ? null : strOptString;
        this.f18949c = jSONObject.getString("offerIdToken");
        JSONArray jSONArray = jSONObject.getJSONArray("pricingPhases");
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new ef.f(jSONObjectOptJSONObject));
                }
            }
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("installmentPlanDetails");
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.getInt("commitmentPaymentsCount");
            jSONObjectOptJSONObject2.optInt("subsequentCommitmentPaymentsCount");
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("transitionPlanDetails");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.getString("productId");
            jSONObjectOptJSONObject3.optString("title");
            jSONObjectOptJSONObject3.optString("name");
            jSONObjectOptJSONObject3.optString("description");
            jSONObjectOptJSONObject3.optString("basePlanId");
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("pricingPhase");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.optString("billingPeriod");
                jSONObjectOptJSONObject4.optString("priceCurrencyCode");
                jSONObjectOptJSONObject4.optString("formattedPrice");
                jSONObjectOptJSONObject4.optLong("priceAmountMicros");
                jSONObjectOptJSONObject4.optInt("recurrenceMode");
                jSONObjectOptJSONObject4.optInt("billingCycleCount");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        if (jSONArrayOptJSONArray != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                arrayList2.add(jSONArrayOptJSONArray.getString(i11));
            }
        }
    }
}
