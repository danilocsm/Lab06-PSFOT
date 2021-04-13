package model;

public enum VaccinationRequirements {
    VACCINATION_AGE{

		@Override
		public String getValue() {
			return "65";
		}
    },
    VACCINATION_OCCUPATION{

        @Override
        public String getValue() {
            return "Teachers";
        }
    }, 
    VACCINATION_COMORBIDITIES{
        
        @Override
        public String getValue() {
            return "Heart Problems";
        }
    };


    public abstract String getValue();
}
